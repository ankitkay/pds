$(function(){
	// solving active menu problem
	switch(menu){
	case 'ABOUT US':
		$('#about').addClass('active');
		break;
	case 'CONTACT US':
		$('#contact').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}
});